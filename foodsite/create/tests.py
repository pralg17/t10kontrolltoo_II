from django.test import TestCase
from create.models import *
# Create your tests here.
class ToiduaineTestCase(TestCase):
	def setUp(self):
		Toiduaine.objects.create(nimetus="kartul", valgud="33", rasvad="20", sysivesikud="30")
	
	def test_toiduaine(self):
		kartul = Toiduaine.objects.get(nimetus="kartul")
		self.assertEqual(kartul, "kartul")