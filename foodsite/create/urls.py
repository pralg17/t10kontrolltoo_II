from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'^$', views.index, name='index'),
    url(r'^tkform/$', views.tkform, name='tkform'),
    url(r'^toiduaineform/$', views.toiduaineform, name='toiduaineform'),
    url(r'^toiduform/$', views.toiduform, name='toiduform'),
    url(r'^toiduained/$', views.toiduained, name='toiduained'),
    url(r'^search/$', views.search, name='search'),
    url(r'^edit/([0-9]+)/$', views.edit, name='edit'),
    url(r'^delete/([0-9]+)/$', views.delete, name='delete'),
    url(r'^toidud/$', views.toidud, name='toidud')
]
