# Nichtfunktionale Anforderungen

Dieses Dokument hält die nichtfunktionalen Anforderungen fest, die für die Anwendung "Edible"  definiert wurden.

### Versionen

* Nummer: 1.0 | Bearbeiter: Hendrik Niemann | Status: genehmigt

## Inhalt
* N10 Fachliche Mengen
* N20 Useability
* N30 Erscheinungsbild
* N40 Performanz
* N50 Wartbarkeit
* N60 Tests

## N10 Fachliche Mengen

### N10.1 Useranzahl
Bei der Anzahl der Nutzer wird zu Beginn von einer Nutzeranzahl von unter 1000 Nutzern ausgegangen. Die Anwendung sollte später auch für größere Nutzeranzahlen auslegbar sein.

### N10.2 Blacklist Einträge
Jeder Nutzer hat durchschnittlich 10 Inhaltsstoffe in seiner Blacklist.

## N20 Usability

### N20.1 Einfachheit der Oberfläche
Die Oberfläche muss selbsterklärend und einfach sein, damit es auch von Einsteigern ohne Einweisung verwendet werden kann.

### N20.2 Dokumentation der Funktionen
Die Funktionen der Oberfläche werden in einem Handbuch dokumentiert.

### N20.3 Lesbarkeit der Inhalte
Inbesondere auf dem niedrig auflösendem Bildschirm der Vuzix M100 muss auf eine gute Lesbarkeit der Inhalte geachtet werden. Auch auf allen anderen Plattformen muss eine Lesbarkeit gegeben sein.

## N30 Erscheinungsbild

### N30.1 Einheitlichkeit der Oberfläche
Die Erscheinung der Oberfläche soll in Design und Bedienungskonzept einheitlich sein.

## N40 Performanz

### N40.1 Reaktionszeiten
Der Server soll für die Bearbeitung einer Anfrage maximal 100ms brauchen.

### N40.2 Anfragen pro Minute (auf dynamische Inhalte)
Es wird von maximal 60 Anfragen pro Minute unter Volllast ausgegangen.

### N40.3 Verfügbarkeit und Downtime
Da die App vorerst nicht kommerziell betrieben wird, ist eine hohe Verfügbarkeit nicht wichtig. Eine Verfügbarkeit des Webservices von 98% im Jahreszeitraum ist damit ausreichend.

## N50 Wartbarkeit

### N50.1 Codequalität
Für die Qualität und Einheitlichkeit des Codes wird ein Styleguide definiert, dem der produzierte Code entsprechen muss.

### N50.2 Dokumentation im Code
Der Code muss mit ausreichend Kommentaren ausgestattet sein. Für eine Automatische Dokumentationserstellung werden spezielle Kommentare erstellt, die automatisch verarbeitet werden. Diese Kommentare werden im Styleguide festgehalten.

## N60 Tests

### N60.1 Testbarkeit
Anforderungen an die Testbarkeit werden in einem seperatem Testkonzept ferstgelegt.