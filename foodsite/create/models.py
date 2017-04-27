from django.db import models
from django.forms import ModelForm
from django.core.validators import MinValueValidator, MaxValueValidator


# Create your models here.
class Toiduaine(models.Model):
    nimetus = models.CharField(max_length=50)
    valgud = models.IntegerField(validators=[MinValueValidator(0),
                                       MaxValueValidator(100)])
    rasvad = models.IntegerField(validators=[MinValueValidator(0),
                                       MaxValueValidator(100)])
    sysivesikud = models.IntegerField(validators=[MinValueValidator(0),
                                       MaxValueValidator(100)])

    def __str__(self):
        return self.nimetus


class Toidukomponent(models.Model):
    toiduaine = models.ForeignKey(Toiduaine, on_delete=models.CASCADE)
    kogus = models.IntegerField(validators=[MinValueValidator(0)])

    def __str__(self):
        return self.toiduaine.nimetus

    def rasvasisaldus(self):

        return self.toiduaine.rasvad * self.kogus

    def valgusisaldus(self):

        return self.toiduaine.valgud * self.kogus

    def sysivesikusisaldus(self):

        return self.toiduaine.sysivesikud * self.kogus

class Toit(models.Model):
    nimetus = models.CharField(max_length=50)
    toidukomponendid = models.ManyToManyField(Toidukomponent, db_constraint=models.CASCADE)

    def __str__(self):
        return self.nimetus

    def kysiValgud(self):
        kogus = 0
        komponendid = self.toidukomponendid.all()
        for k in komponendid:
            kogus += k.valgusisaldus()

    def kysiRasvad(self):
        kogus = 0
        komponendid = self.toidukomponendid.all()
        for k in komponendid:
            kogus += k.rasvasisaldus()

    def kysiSysivesikud(self):
        kogus = 0
        komponendid = self.toidukomponendid.all()
        for k in komponendid:
            kogus += k.sysivesikusisaldus()

class ToiduaineForm(ModelForm):
    class Meta:
        model = Toiduaine
        fields = ['nimetus', 'valgud', 'rasvad', 'sysivesikud']


class ToidukomponendiForm(ModelForm):
    class Meta:
        model = Toidukomponent
        fields = ['toiduaine', 'kogus']


class ToitForm(ModelForm):
    class Meta:
        model = Toit
        fields = ['nimetus', 'toidukomponendid']