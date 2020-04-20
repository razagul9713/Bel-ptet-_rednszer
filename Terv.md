# SecuritySystem 

## **Terv**

Az a tervem, hogy egy olyan megbízható beléptető rendszert készítsek amivel könnyedén belehet azonosítani egy cégnél, hogy az adott ember, aki épp belép az épületbe, az ott dolgozik-e vagy sem. A célom az, hogy maga a szoftver egyszerű és könnyedén értelmezhető legyen bárki számára, illetve hogy minél biztonságosabb legyen

Nem az a célom, hogy ez legyen a legnépszerűbb rendszer, csak szeretném, hogy az emberek számára több lehetőség is adódjon, hogy ne csak egy biztonsági szoftvert tudjanak alkalmazni. Tegyük fel, hogy egy új iskola épül, ahol szeretnének egy egyszerű, de mégis biztonságos securty system-et bevezetni, de nem szeretnének nagyon drágán vásárolni ilyen terméket.

##**Működése**

Maga a rendszer beléptető kártyákkal működne. A kártyára felinportálva a szükséges adatokat, amit egy adatbázisban tárolunk, tudnának a diákok és a tanárok közlekedni az épületben. A bejáratnál lenne egy kártya beolvasó, ami össze egyezteti a kártyán lévő adatokat, az adatbázisban lévő adatokkal, és ha talál olyan nevű hallgatót, vagy oktatót a rendszerben, akkor beléphet az épületbe. Kis kiegészítésként még egy kijelzőn láthatunk egy fotót illetve az adott ember nevét, aki belép az épületbe.

Ez az egész rendszer az adott épület hálozatán működne, de természetesen dinamikusan változó ez a szoftvercsomag. Lesz egy közös ősosztály amiben az embereket fogom tárolni és lesznek külön gyermek osztályok amiben a hallgatókat és az oktatókat fogom feljegyezni.
Lesznek metódusok, amik az életkort fogják kezelni, ezáltal lesz azonosítható, hogy ki diák és ki tanár. Továbbá a nemzetiséget fogom még hozzá venni az azonosításhoz, ugyanis, ha lennének külföldi hallgatók, az ő esetüknél még ezt is figyelembe kell venni.

Továbbá még a diákigazolvány számot is tárolom, amivel látható lesz a rendszerben, hogy kinek érvényes illetve kinek nem érvényes az igazolványa.  


