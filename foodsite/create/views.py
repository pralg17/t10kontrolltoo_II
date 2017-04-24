from django.shortcuts import render
from django.http import HttpResponse
from django.http import HttpResponseRedirect
from .models import ToiduaineForm
from .models import ToitForm


def index(request):
    return HttpResponse("Index page")


def get_toiduaine(request):

    if request.method == 'POST':
        form = ToiduaineForm(request.POST)
        if form.is_valid():
            return HttpResponseRedirect("/index/")
    else:
        form = ToiduaineForm()

    return render(request, 'toiduained.html', {'form': form})
