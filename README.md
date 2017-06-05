# Žiačik - hudobná teória

Cieľom projektu je vytvoriť interaktívnu pomôcku na učenie sa hudobnej teórie pre hudobníkov - začiatočníkov. Vytvorená aplikácia má za úlohu precvičovať polohu nôt na notovej osnove. Rozhodla som sa vytvoriť windowsovú aplikáciu pomocou programovacieho jazyka Java (JavaFX), nakoľko tento je mi na základe môjho štúdia informatiky na FMFI najbližší. 

## Princíp fungovania

Úvodná obrazovka obsahuje menu pozostávajúce z troch položiek:

    Testovací mód
    Herný mód
    Nastavenia

V sekcii Nastavenia dostane užívateľ možnosť vybrať si škálu tónov, z ktorých chce byť testovaný. Teda si vykliká (prostredníctvom Checkboxov), či testovanie bude zahŕňať len základné tóny, alebo aj krížiky a béčka. Užívateľ tu tiež môže povoliť alebo zakázať zvuky. Prednastavene je výber nastavený na základné tóny a zvuky sú vypnuté.

Následne si užívateľ vyberie z dvoch módov: Testovacieho a Herného.
### Testovací mód

V tomto móde sa hráčovi zobrazí okno s obrázkom noty a tlačidlá s názvami.

Jeho úlohou je kliknutím na príslušné tlačidlo vybrať správny názov zobrazenej noty. Ak vyberie správnu notu, tlačidlo zasvieti na zeleno, zaznie daný tón(čím hráč zároveň podvedome získava predstavu o znení daných tónov) a zobrazí sa ďalšia nota. Ak odpovie nesprávne, tlačidlo sa zafarbí načerveno a hráč má ďalší pokus. V spodnej časti panelu sa nachádzajú dve tlačidlá - Ďalej a Ukončiť. Pokiaľ hráč niektorý tón nevie identifikovať, namiesto zbytočného tipovania môže tlačidlom Ďalej preskočiť na ďalší tón. Hráč môže testovanie kedykoľvek ukončiť kliknutím na tlačidlo Ukončiť. V hornej časti panelu hráč po celý čas vidí počet správnych/všetkých odpovedí. Po ukončení tréningu sa hráčovi zobrazí oznam o jeho percentuálnym ohodnotením, s patričným hudobným (a snáď aj trochu humorným) podtónom podľa percentuálneho zisku. Napr. v intervale 0-20%: „Ešte trocha cvičenia a hru na triangel by si zvládnuť snáď mohol.“


### Herný mód

Po vybratí tohto módu užívateľ uvidí ponuku Štart, Pomoc a HighScore. Po kliknutí na HighScore sa mu zobrazí rebríček s piatimi najlepšími bodovými ziskami. Po kliknutí na Pomoc sa zobrazí jednoduchý opis hry a pokyny. V hernom móde bude úlohou užívateľa uhádnuť správne čo najviac tónov.

Po spustení hry sa zobrazí prvá nota. Ak hráč uhádne označenie danej noty správne, tak zaznie tón danej noty, tlačidlo sa rozsvieti na zeleno, zobrazí sa ďalšia nota. Počet odpovedí aj zostávajúcich pokusov sa zvýši o jeden. Ak však notu hráč označí nesprávne, tlačidlo sa rozosvieti na červeno, zobrazí sa ďalšia nota a ako penalizácia sa z celkového počtu zostávajúcich pokusov jeden odpočíta. Po vyčerpaní všetkých pokusov sa hráčovi zobrazí tabuľka s High Score. Ak bol jeho výkon dostatočne dobrý, jeho výsledok sa zaradí do tabuľky.

