2.1 Backend
Der Zweck des Backends besteht darin, eine Schnittstelle zur Verfügung zu stellen, die sämtliche Funktionalitäten des Produktes abbildet. Diese Schnittstelle wird sowohl vom Web-Frontend, als auch von der HMD-Applikation verwendet.

2.1.1 Schnittstellen
Die API arbeitet mit dem REST-Konzept (Representational State Transfer). Hierbei werden die Methoden GET, PUT, POST und DELETE des HTTP-Protokolls verwendet, um die API anzusprechen. Ein GET-Request auf eine Route, ggf. mit Parametern, liefert Daten zurück, mithilfe von PUT werden neue Datensätze angelegt, POST wird verwendet um Daten zu bearbeiten und mit DELETE werden nicht mehr benötigte Daten gelöscht. Zur Repräsentation von Daten wird JSON (JavaScript Object Notation) verwendet. Die Routen der API können im Anhang eingesehen werden.

2.1.2 Klassendiagramme
Alle Klassen zur Realisierung der API-Routen sind in PHP implementiert. Die Klasse "API" stellt die Architektur der RESTful API zur Verfügung, "DB" verwaltet den Zugriff auf die Datenbank. Die Klassen "Ingredient", "Product", "Session" und "User" bilden die korrespondierenden Daten ab. Desweiteren gibt es zwei Fehlerklassen, die zwischen internen (InternalError) und userspezifischen (UserError) Fehlern unterscheiden.
Details können dem Klassendiagramm im Anhang entnommen werden.

2.1.3 Datenmodell
In der MySQL-Datenbank werden die Daten für das Backend gespeichert. Die Stammdaten des Systems sind Produkte und deren Inhaltsstoffe mit einer Kategorisierung gespeichert werden. Bewegungsdaten sind hauptsächlich das Accountsystem, das die User und ihre verknüpften Endgeräte umfasst, aber auch die Backlists, auf denen die Benutzer Inhaltsstoffe dynamisch hinzufügen und entfernen.
Details können dem ER-Diagramm im Anhang entnommen werden.

2.1.4 Libraries und Framworks
Für das Backend werden keine größeren Frameworks oder Libraries verwendet, da der Funktionsumfang der API am effektivsten durch vollständig eigene Implementierung umgesetzt werden kann.
Auf diese Weise können die Teammitglieder vorhandenes Wissen sowohl anwenden als auch vertiefen – mit vollständiger Kontrolle und Transparenz jeder implementierten Komponente. So werden Abhängigkeiten von externen Komponenten vermieden und unter anderem Performanceproblemen vorgebeugt.

2.1.5 Server
Zur Umsetzung des Server-Backends wird Debian GNU/Linux eingesetzt. Version 8 (mit dem Releasenamen Jessie) befindet sich seit dem 05. November 2014 im Codefreeze. Änderungen im Code sind ab diesem Zeitpunkt kaum zu erwarten. Jessie bietet somit eine sowohl zuverlässige als auch aktuelle Grundlage für die Architektur der Web-Applikation darüber. Seit dem 26. April 2015 ist Debian Jessie "stable". Apache HTTP Server (in der Version 2.4.10) deckt die Funktionalität des Webservers ab. MySQL-Server (5.4.42) die des Datenbankmanagementsystems. Zu administrativen Zwecken wird zusätzlich phpMyAdmin (4.2.12) eingesetzt. 
Um zusätzliche Sicherheit zu gewährleisten, sperrt Apache (mittels separater .htaccess-Restriktion) den Zugang mit einem eigenen Passwort. Darüber hinaus wird der Zugriff nur eingerichteten IP-Adressen gewährleistet. Die MySQL-Datenbank wird lediglich lokal dem Server zur Verfügung gestellt. Öffenlich erreichbar ist Port 80, zur Erreichbarkeit der Website bzw. API.
