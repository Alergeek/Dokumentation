# Funktionale Anforderungen

## F10 Vuzix AppDie androidbasierte Anwendung auf der Vuzix,Lauffähige Anwendung,,1,definiert

### F10.1 Login / Verknüpfung App mit Webaccount
Um sein mobiles Endgerät mit einem Account zu verbinden, scannt der Benutzer einen Barcode, der ihm im Webbrowser angezeigt wird. Der User muss sich dafür bereits auf der Website registriert haben.

## F20 Accountsystem

### F20.1 Accounterstellung
Der Benutzer kann einen Account anlegen, der in der Datenbank

### F10.2 Anzahl mobiler Endgeräte
Der Nutzer kann  beliebig viele mobile Endgeräte mit seinem Account verbinden.


### FXXX Sprachsteuerung

### FXXX.1 Vuzix Standard-Sprachbefehle
Die App muss die folgenden Standardbefehle erkennen:
* "Go Home"
* 

### FXXX.1 Eigene Sprachbefehle

F12,Produktbarcode scannen,Der Produktbarcode wird durch Sprachbefehl gescannt,Richtig erkannter Barcode wird zurück gegeben,,1,definiert
F13,Produkt erkennen,Dem Service wird der Produktbarcode übermittelt zur Überprüfung,Übermittlung muss fehlerfrei ,,1,definiert
F14,Antwort anzeigen,"Die Antwort des Services muss ausgewertet werden, User muss Ergebnis angezeigt werden",User muss ein optisches Feedback erhalten,,1,definiert

## FYYY Homescreen

### FYYY.1 Startbildschirm
Nach dem Start der App wird der Homescreen angezeigt und wartet auf einen Sprachbefehl zum Scannen

### FYYY.2 

F20,Web-Application,Die webbasierte Anwendung zur Verwaltung persönlicher Daten,Muss erreichbar sein,,1,definiert
F21,Registrierung ,Die User-Registrierung auf der Webseite,Registrierung muss für einen User möglich sein,,1,definiert
F22,Registrierungsbarcode,Die Erzeugung des Barcodes zur Kopplung der Vuzix,Barcode wird richtig erzeugt,,2,definiert
F23,User-Daten verwalten,"Möglichkeit zur Eingabe Benutzerdaten (Email, Passwort)",Daten müssen durch den User persistent verändert werden können,,2,definiert
F999,Blacklist bearbeiten,Möglichkeit zur Bearbeitung der Blacklist,Daten müssen durch den User persistent verändert werden können,,1,definiert
F999.1,Blacklisteinträge anlegen,Der Benutzer kann Einträge aus der Inhaltsstoffdatenbank zu seiner Blacklist hinzufügen,Änderung wird in der Datenbank übernommen,Änderung wird in der Datenbank übernommen,,1,definiert
F999.2,Blacklisteinträge löschen,Der Benutzer kann Einträge aus seiner Blacklist entfernen,,1,definiert

## FZZZ Webanwendung
