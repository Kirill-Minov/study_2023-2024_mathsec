---
## Front matter
title: "Шаблон отчёта по лабораторной работе"
subtitle: "Простейший вариант"
author: "Дмитрий Сергеевич Кулябов"

## Generic otions
lang: ru-RU
toc-title: "Содержание"

## Bibliography
bibliography: bib/cite.bib
csl: pandoc/csl/gost-r-7-0-5-2008-numeric.csl

## Pdf output format
toc: true # Table of contents
toc-depth: 2
lof: true # List of figures
lot: true # List of tables
fontsize: 12pt
linestretch: 1.5
papersize: a4
documentclass: scrreprt
## I18n polyglossia
polyglossia-lang:
  name: russian
  options:
	- spelling=modern
	- babelshorthands=true
polyglossia-otherlangs:
  name: english
## I18n babel
babel-lang: russian
babel-otherlangs: english
## Fonts
mainfont: PT Serif
romanfont: PT Serif
sansfont: PT Sans
monofont: PT Mono
mainfontoptions: Ligatures=TeX
romanfontoptions: Ligatures=TeX
sansfontoptions: Ligatures=TeX,Scale=MatchLowercase
monofontoptions: Scale=MatchLowercase,Scale=0.9
## Biblatex
biblatex: true
biblio-style: "gost-numeric"
biblatexoptions:
  - parentracker=true
  - backend=biber
  - hyperref=auto
  - language=auto
  - autolang=other*
  - citestyle=gost-numeric
## Pandoc-crossref LaTeX customization
figureTitle: "Рис."
tableTitle: "Таблица"
listingTitle: "Листинг"
lofTitle: "Список иллюстраций"
lotTitle: "Список таблиц"
lolTitle: "Листинги"
## Misc options
indent: true
header-includes:
  - \usepackage{indentfirst}
  - \usepackage{float} # keep figures where there are in the text
  - \floatplacement{figure}{H} # keep figures where there are in the text
---

# Цель работы

Создать на языке программирования  реализацию шифра Цезаря с произвольным  ключом k и шифр Атбаш

# Теоретическое введение

Шифр Цезаря (шифр простой замены) — это моноалфавитная подстановка, т.е. каждой букве открытого текста ставится в
соответствие одна буква шифртекста. На практике при создании шифра простой замены в качестве шифроалфавита берется исходный алфавит, но с нарушенным порядком букв (алфавитная перестановка)
Математически процедуру шифрования можно описать следующим образом: , где T_m={T^j}, j=0,1,...,m-1, T^j(a)=(a+j) mod (m) - операция нахождения остатка от целочисленного деления a+j  на m , 
а  T_m - циклическая группа. Обобщение шифра Цезаря на случай произвольного ключа k для латинского алфавита: (i+k) mod (26).
Шифр Атбаш является шифром сдвига на всю длину алфавита. Для реализации шифра целесообразно пользоваться таблицей ASCII и функциями работы с ней: ord и char.

# Выполнение лабораторной работы
Первым заданием был шифр Цезаря. Переменные  message и  offset  соответсвуют введеными с клавиатуры тексту и ключу, нужному для шифрования.
result - конечное представления введенного текста. originalAlphabetPosition - переменная, в которой лежит изначальное положение элемента,
newAlphabetPosition - позиция элемента после примнения шифрования. newCharacter - переменная отвечающая за хранения полученного элемента после шифровки.
Весь алгоритм представляет из себя цикл в котором мы вычисляем текущее положение, новое положение и новую букву. 

![Код программы](/image/picture1.png)

![Реализация шифра цезаря](/image/picture2.png)

Второе задание  - реализация шифра  Атбаш. 
Создание пустой строки ciphertext для хранения зашифрованного текста.

Проход по каждому символу в исходном тексте plaintext с помощью цикла for.
Для каждого символа в plaintext:

Проверка, является ли символ буквой с помощью Character.isLetter(currentChar). Если символ не является буквой, он остается без изменений, и мы добавляем его к ciphertext.
Если символ - буква, мы определяем, является ли она заглавной или строчной буквой, сравнивая её с символом 'A'. Если символ в верхнем регистре, baseChar устанавливается как 'A', иначе как 'a'.
Мы вычисляем смещение offset текущей буквы относительно baseChar. Например, для буквы 'c' смещение составит 2 (поскольку 'c' идет после 'a' и 'b' в алфавите).
Мы находим зашифрованную букву, вычитая offset из индекса текущей буквы относительно baseChar и добавляя это значение к baseChar. Например, если текущая буква - 'c', то зашифрованная буква будет 'x'.
Зашифрованная буква добавляется к строке ciphertext.
По завершении цикла, строка ciphertext содержит зашифрованный текст, и он возвращается как результат работы метода encrypt.

![Код программы](/image/picture3.png)

![Реализация шифра Атбаша](/image/picture4.png)



# Выводы
В ходе выполнения данной работы был реализован шифр Цезаря и шифр Атбаш на языке программирования Java

# Список литературы{.unnumbered}

::: {#refs}
:::
