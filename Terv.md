# RobotGyartas

## **Elképzelés**
A mai világban mára már a technikai fejlődés oda jutott, hogy az emberi munkát akár gépekkel helyettesítsék. Ezért is gondoltam, hogy egy kis projektet készítek, ami azt mutatja be, hogy hogyan is épülne fel egy Robot gyártás, ami emberi munkaerőre lenne képes.

##**Osztályok**
..* Abstract
..* Interface

## **Működése**

Mivel ez az egész projekt eléggé összetett, ezért én csak pár részletét szeretném egy kicsit megvalósítani ennek a tervnek.  Lesz egy osztályom, ami a Robotokat fogja kezelni, és lesz egy, ami az embereket. Mivel munkaerő helyettesítésről van szó, ezért szükség van egy olyan osztályra, ami az embert és a Robotot összegyúrja. Ehhez szükséges egy Ember Interface, amiben a szükséges emberi adatokat tárolom. Majd lesz egy Robot osztályom, amiben az ő adatait rögzítem, és természetesen szükségem lesz olyan metódusokra is, amivel a két osztályt kezelni tudom.

Továbbá szükséges egy abstarct osztály amiben a Robot külső textúráját tárolom, ugyanis, nem mindegy, hogy egy szalagrobotról lesz szó, vagy éppenséggel, egy olyan Robotról, aki nehezebb fizikai munkát végez. Ezen túl még kell egy olyan abstarct osztály, ami a Robotnak a szívósságáért felel, azaz egy ötvözetre, hogy tartós legyen.

##**Felhasználási terület**

Majd különféle robot csoportokat hozok létre, ami a különböző területeken lesz alkalmas használni, mint például Irodai Robot, vagy egy Házi Robot.

##**Tervezési minták és alapelvek**

1. Létrehozási minta
..* prototípus
..* Gyárt
2. Szerkezeti minta
..* díszítő
3. Viselkedési minta
..* Állapot
4. GOF1, GOF2, ISP, SRP

Tervezési alapelvek közül az OOP-t és azon belül a GOF1, GOF2 ISP és SRP elveket használom. Tervezési mintákon belül létrehozási tervezési mintát is használok, és azon belül a prototípus illetve gyártmetódust, a szerkezeti tervezési mintán belül a díszítőt használom és a viselkedési mintán belül az állapot mintát használom. 
  


