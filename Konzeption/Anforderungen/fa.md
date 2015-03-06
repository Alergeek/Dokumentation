# Funktionale Anforderungen

## Inhalt

* F10 HMD App
* F20 Accountsystem
* F30 Webapplikation
* F40 Android-Smartphone App

### Versionen
* Nummer: 1.0 | Bearbeiter: Maroc Heumann, Hendrik Niemann | Status: Überarbeitung notwendig
* Nummer: 1.1 | Bearbeiter: Marco Heumann, Moritz Bästlein, Marco Schenkel | Status: In Revision

## F10 HMD App

### F10.1 Zielsystem
Das Zielsystem der HMD App ist die Vuzix M100. Die App muss ohne Einschränkungen auf der Vuzix M100 lauffähig sein.

### F10.2 Login / Verknüpfung App mit Webaccount
Um sein mobiles Endgerät mit einem Account zu verbinden, scannt der Benutzer einen Barcode, der ihm im Webbrowser angezeigt wird. Der User muss sich dafür bereits auf der Website registriert haben.

### F10.3 Sprachsteuerung
Die App verfügt sowohl über den Standard-Sprachbefehl "go home" als auch den spezifischen Sprachbefehl "scan" zum Starten des Produktscanners.

## F10.4 Homescreen
Nach dem Start der App wird der Homescreen angezeigt. Hier wird auf den Sprachbefehl zum Scannen gewartet.

### F10.5 Produktbarcode scannen
Mit dem Sprachbefehl "scan" aktiviert der Nutzer im Homescreen den Scanner. Danach kann er über die Kamera den
Barcode eines Produkts scannen.

### F10.6 Infoscreen
Wurde ein Produkt eingescannt, wird dem Benutzer auf dem Infoscreen das Ergebnis angezeigt. Nach 10 Sekunden im Infoscreen kehrt die App automatisch in den Homescreen zurück.

## F20 Accountsystem

### F20.1 Accounterstellung [! siehe F30.1 !]
Der Benutzer kann einen Account erstellen, der persistent im System gespeichert wird.

### F20.2 Anzahl mobiler Endgeräte
Der Nutzer kann  beliebig viele mobile Endgeräte mit seinem Account verbinden.

## F30 Webapplikation

### F30.1 Registrierung [! siehe F20.1 !]
Der Benutzer kann einen neuen Account über ein Registrierungsformular erstellen.

### F30.2 Login
Der Benutzer kann sich mit seiner Email-Adresse und seinem Passwort in einem Loginformular anmelden. 

### F30.3 Blacklist bearbeiten
Der Benutzer kann Einträge aus der Inhaltsstoffdatenbank zu seiner Blacklist sowohl hinzufügen als auch wieder entfernen.

### F30.4 Kopplungsbarcode anzeigen
Für die Verbindung mit der HMD-App wird ein Barcode im Web-Browser angezeigt.

### F30.5 Benutzerdaten ändern
Der Nutzer kann seine Email-Adresse und sein Passwort ändern.

### F30.6 Email-Adresse bestätigen
Registriet sich ein Benutzer oder ändert er seine Emailadresse, muss er diese bestätigen. Zum Bestätigen wird eine Bestätigungslink an die Emailadresse versandt, die durch den Benutzer bestätigt werden muss.

## F40 Android-Smartphone App
 
### F40.1 Verwaltung
<noch offen>
 
### F40.2 Registrierung
Der User kann sich für die Nutzung des Dienstes in der Android-Anwendung registrieren.
 
### F40.3 Login
Der User muss sich zur Nutzung des Dienstes in der Android-Anwendung anmelden.
 
### F40.4 Benutzerdaten
Der Nutzer muss seine Email-Adresse und sein Passwort ändern können.
 
### F40.5 Blacklist bearbeiten
Der Benutzer kann Einträge aus der Inhaltsstoffdatenbank zu seiner Blacklist hinzufügen und wieder entfernen.
 
### F40.6 Barcode scannen
Der User scannt einen Produktbarcode und erhält eine Information über die Verträglichkeit.
 
### F40.7 Informationen zum Produkt
Der User kann sich alle Inhaltsstoffe des Produktes anzeigen lassen, sowie eine Websuche nach dem Produkt starten.
