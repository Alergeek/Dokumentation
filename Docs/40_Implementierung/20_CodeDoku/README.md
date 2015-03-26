#Code-Doku
Eine kurze Übersicht, wie Code zu dokumentieren ist, damit mit Doxygen eine Doku generiert werden kann.
Wer sich mit JavaDoc auskennt, kann einfach die Syntax benutzen. Für alle anderen hier die wichtigsten Dinge.

Eine ausführliche Dokumentation von Doxygen ist [hier](http://stack.nl/~dimitri/doxygen/manual/index.html) verfügbar.

##Allgemeines
* Die Code-Dokumentation soll in englischer Sprache erfolgen.
* `/**` leitet einen JavaDoc-Kommentar ein. Er wird wie gewohnt mit `*/` abgeschlossen.
* `@brief TEXT` gibt eine Zusammenfassung der detaillierten Beschreibung an. Diese wird später in der Doku allerdings auch in der Detailbeschreibung mit aufgeführt.
* `@param {datentyp} parametername Beschreibung` beschreibt einen Parameter.

##PHP/Java
Doxygen erkennt automatisch die Architektur der Anwendung, d.h. Klassen mit Membern, Vererbungshierarchie, usw. Kommentare mit einer bestimmten Syntax ergänzen diese Informationen durch aussagekräftige Beschreibungen.

###Klassen
Eine Beschreibung der Klasse kann direkt zu Beginn der Datei (ggf. nach dem PHP-Tag) notiert werden. Hier ein Beispiel:
```php
/*!
  @brief Brief description.
 
  This is a detailed description of the class.
  
 */
```


##Variablen/Membervariablen
```php
protected $member_protected = ['asdf', 'sadf', 'asdf', 'asdf']; ///< Protected member of the Test class.
```
Mit der angegebenen Syntax wird eine Kurzbeschreibung der Variable angegeben. Alternativ ist auch `/**< ... */` für längere Beschreibungen möglich.

##JavaScript
Bei JavaScript ist es obligatorisch, jede Datei mit `@file` zu dokumentieren:
```javscript
/**
 * @file test.js
 * @brief File for Test function.
 *
 * Detailed file description.
 *
 *
 */
```

Ansonsten können Funktionen und Variablen wie üblich kommentiert werden.

##Beispiel
Ein Beispiel für PHP und JS findet sich im Ordner `example`.
[Hier](http://cdn.rawgit.com/Allergeeks/Dokumentation/master/Code-Dokumentation/example/docs/html/index.html) ist die resultierende Doku verfügbar.
