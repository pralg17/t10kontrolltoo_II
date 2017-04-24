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

class Toit(models.Model):
    nimetus = models.CharField(max_length=50)
    toidukomponendid = models.ManyToManyField(Toidukomponent, db_constraint=models.CASCADE)

    def __str__(self):
        return self.nimetus

class ToiduaineForm(ModelForm):
    class Meta:
        model = Toiduaine
        fields = ['nimetus', 'valgud', 'rasvad', 'sysivesikud']

class ToitForm(ModelForm):
    class Meta:
        model = Toit
        fields = ['nimetus', 'toidukomponendid']