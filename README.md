# Dokumentation
Dokumentation des Projektes

##HowTo GitHub
GitHub ist eigentlich sehr einfach mit dem Comand-Line Tool zu verwenden. Dabei gibt es zwei verschiedene Standartaufgaben die zu bew�ltigen sind.
Dabei ist es wichtig sich immer im Ordner des aktuellen Repos zu befinden.

###1. Aktuellsten Stand runterladen:
1. git pull

__Fertig!__

###2. Änderungen vornehemen / Neue Dateien hinzufügen
1. git pull
2. Änderungen machen an den diversen Dokumenten bzw. die neuen Dateien erstellen oder auch löschen
3. git add -A
4. git commit -m "*eure Änderung(en) beschreiben*"
5. git push
6. Nutzernamen und Passwort eingeben (Bei der Passworteingabe wird nichts angeizeigt, also schön sauber schreiben, sonst nochmal ab Schritt 5)

__Fertig!__

###Möglicher Fehler
Es kann passieren, dass ihr die Änderungen nach Schritt 4 nicht pushen könnt. Das liegt dann in den meisten Füllen daran, dass in der Zwischenzeit jemand anderes schon Änderungen getätigt hat. Dann geht es nach Schritt 4 so weiter:
5. Auf GitHub das aktuelle Repo als Zip runterladen (ist im Orga Repo nötig, da wir mit Dateien arbeiten, die nicht nur reinen Text enthalten und bei den nachfolgenden Schritten etwas verloren gehen könnte)
6. git pull
7. git merge
8. git commit -m "merged"
9. git push
10. Benutzername und PW eingeben

__Fertig!__

###Merge- und andere Konflikte
Sollte bei 'git merge' oder anderen Dingen Probleme auftauchen, dann www.gidf.com oder Marco H. fragen.
