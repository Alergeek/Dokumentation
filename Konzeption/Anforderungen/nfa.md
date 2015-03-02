# Nichtfunktionale Anforderungen

Dieses Dokument hält die nichtfunktionalen Anforderungen fest, die für die Anwendung "Edible"  definiert wurden.

### Versionen

* Nummer: 1.0 | Bearbeiter: Hendrik Niemann | Status: in Revision

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
Jeder Nutzer hat durchschnittlich 10 Einträge in seiner Blacklist

## N20 Usability

### N20.1 Einfachheit der Oberfläche
Die Oberfläche muss selbsterklärend und einfach sein.

### N20.2 Dokumentation der Funktionen
Die Funktionen der Oberfläche werden in einem Handbuch dokumentiert.

## N30 Erscheinungsbild

### N30.1 Einheitlichkeit der Oberfläche
Die Erscheinung der Oberfläche soll in Design und Bedienungskonzept einheitlich sein.

## N40 Performanz

### N40.1 Reaktionszeiten
Der Server soll für eine Seite maximal 100ms brauchen.
Der Client soll nach dem Datenempfang maximal 250ms für die Seitenerstellung benötigen.

### N40.2 Anfragen pro Minute (auf dynamische Inhalte)
Es wird von durchschnittlich 60 Anfragen pro Minute ausgegangen.

### N40.3 Verfügbarkeit und Downtime
Da die App vorerst nicht kommerziell betrieben wird, ist eine hohe Verfügbarkeit nicht wichtig. Eine Verfügbarkeit von 98% ist damit ausreichend.

## N50 Wartbarkeit

### N50.1 Codequalität
Für die Qualität und Einheitlichkeit des Codes wird ein Styleguide definiert, dem der produzierte Code entsprechen muss.

### N50.2 Dokumentation
Der Code muss mit ausreichend Kommentaren ausgestattet sein. Für eine Automatische Dokumentationserstellung werden spezielle Kommentare erstellt, die automatisch verarbeitet werden. Diese Kommentare werden im Styleguide festgehalten.

## N60 Tests

### N60.1 Testbarkeit
Anforderungen an die Testbarkeit werden in einem seperatem Testkonzept ferstgelegt.
