from django.conf.urls import url
from django.contrib import admin
from django.conf.urls import include, url
from django.contrib import admin

urlpatterns = [
    url(r'^', include('create.urls')),
    url(r'^admin/', admin.site.urls)
]
