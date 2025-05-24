**Втора лабораториска вежба по Софтверско инженерство**
---
**Симона Мицева 233174**
---

**Control Flow Graph**
---

![Control Flow Graph](cfg.png)

**Цикломатска комплексност**
---
Цикломатската комплексност на кодот изнесува 9.Овој резултат го добив од бројот на региони плус надворешната област.

**Тест случаи според Every Statement критериумот**
---
За да се постигне овој критериум потребни се најмаку 5 тест случаи.<br>
1.checkCart(null, "1234567890123456");<br>
-Се праќа празна листа и се очекува да фрли усклучок RuntimeException("allItems list can't be null!")<br>
2.List<Item> items = List.of(new Item(null, 1, 100, 0.0));<br>
  checkCart(items, "1234567890123456");<br>
  -Овде се праќа null за име и се очекува да фрли исклучок RuntimeException("Invalid item!")<br>
3.List<Item> items = List.of(new Item("item1", 11, 350, 0.1));<br>
  checkCart(items, "1234567890123456");<br>
  -Артиклот има попуст, цена и голема количина.Со овој тест случај се покрива поголем дел од кодот.<br>
4.List<Item> items = List.of(new Item("item1", 2, 100, 0.0));<br>
  checkCart(items, "1234abcd5678efgh");<br>
  -Артиклот има цена и количина.Со ово тест случај се покрива дел од кодот каде се прсметува сумата без попуст.Исто така после тоа фрла исклучок за RuntimeException("Invalid character in card number!")<br>
5.List<Item> items = List.of(new Item("item1", 2, 100, 0.0));<br>
  checkCart(items, "1234");<br>
-Со овој тест случај се очекува да фрли исклучок RuntimeException("Invalid card number!")<br>

**Тест случаи според Multiple Condition критериумот**
---




