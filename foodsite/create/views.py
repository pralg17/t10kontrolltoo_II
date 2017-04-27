from django.shortcuts import render
from django.http import HttpResponse
from django.http import HttpResponseRedirect
from .models import *

def index(request):
    foo = Toiduaine.objects.all().values()
    foo2 = Toidukomponent.objects.all().values()
    foo3 = Toit.objects.all().values('toidukomponendid__toiduaine__nimetus')
    return render(request, 'index.html', {'list1': foo,
                                          'list2': foo2,
                                          'list3': foo3})


def toiduaineform(request):

    if request.method == 'POST':
        form = ToiduaineForm(request.POST)
        if form.is_valid():
            toiduaine = Toiduaine(nimetus=form.cleaned_data['nimetus'],
                                  valgud=form.cleaned_data['valgud'],
                                  rasvad=form.cleaned_data['rasvad'],
                                  sysivesikud=form.cleaned_data['sysivesikud'])
            toiduaine.save()
            foo = Toiduaine.objects.all().values()
            return render(request, 'index.html', {'list1': foo})
    else:
        form = ToiduaineForm()

    return render(request, 'toiduaineform.html', {'form': form})

def tkform(request):

    if request.method == 'POST':
        form = ToidukomponendiForm(request.POST)
        if form.is_valid():
            form.save()
            foo = Toidukomponent.objects.all().values()
            return render(request, 'index.html', {'list2': foo})
    else:
        form = ToidukomponendiForm()

    return render(request, 'tkform.html', {'form': form})

def toiduform(request):

    if request.method == 'POST':
        form = ToitForm(request.POST)
        if form.is_valid():
            form.save()
            foo = Toit.objects.all().values()
            return render(request, 'index.html', {'list3': foo})
    else:
        form = ToitForm()

    return render(request, 'toiduform.html', {'form': form})

def toiduained(request):

    toiduained = Toiduaine.objects.all().values()
    return render(request, 'toiduained.html', {'list1': toiduained})

def search(request):
    if 'x1' in request.GET and 'x2' in request.GET:
        x1 = request.GET['x1']
        x2 = request.GET['x2']
        toiduained = Toiduaine.objects.filter(rasvad__lte=x2, rasvad__gte=x1)
    else:
        toiduained = []
    return render(request, 'toiduained.html', {'list1': toiduained})


def edit(request, id):
    toiduaine = Toiduaine.objects.get(pk=id)
    return render(request, 'edit.html', {'toiduaine': toiduaine})

def delete(request, id):
    nimetus = ''
    if Toiduaine.objects.filter(id=id).exists():
        toiduaine = Toiduaine.objects.get(pk=id)
        nimetus = toiduaine.nimetus+" kustutatud!"
        toiduaine.delete()

    return render(request, 'edit.html', {'deleted': nimetus})

def toidud(request):
    toit = []
    toitained = []
    message = ""
    valgud = ''
    rasvad = ''
    sysivesikud = ''
    if 'r' in request.GET:
        toit = Toit.objects.get(nimetus=request.GET['r'])
        toitained = toit.toidukomponendid.all().values()
        valgud = toit.kysiValgud
        rasvad = toit.kysiRasvad
        sysivesikud = toit.kysiSysivesikud

    if not toit:
        message = "Sellise nimega toitu ei leitud!"
    else:
        message = ""
    return render(request, 'toit.html', {'toit': toit, 'message': message, 'toitained': toitained,
                                         'valgud': valgud, 'rasvad': rasvad, 'sysivesikud': sysivesikud})
