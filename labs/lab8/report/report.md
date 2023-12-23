---
## Front matter
title: "Лабораторная работа 8"
subtitle: "Математические основы защиты информации и информационной безопасности"
author: "Минов Кирилл Вячеславович | НПМмд-02-23"

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

Реализовать на языке программирования алгоритмы для выполнения арифметических операций с большими целыми числами.

# Теоретическое введение
Считаем, что число записано b-ичной системе счисления, b - натуральное число, b >= 2. Натуральное n-разрядное число будем записывать в виде u=u1u2...un. 
При работе с большими целыми числами знак такого числа удобно хранить в отдельной переменной. Например, при умножении двух чисел, знак произведения вычисляется отдельно. 

# Выполнение лабораторной работы
Алгоритм 1 (сложение неотрицательных целых чисел).

![Алгоритм 1 (сложение неотрицательных целых чисел)](image/alg1.PNG){ #fig:001 width=80% }
Алгоритм 2 (вычитание неотрицательных целых чисел).

![Алгоритм 2 (вычитание неотрицательных целых чисел)](image/alg2.PNG){ #fig:002 width=80% }
Алгоритм 3 (умножение неотрицательных целых чисел столбиком).

![Алгоритм 3 (умножение неотрицательных целых чисел столбиком)](image/alg3.PNG){ #fig:003 width=80% }
Алгоритм 4 (быстрый столбик).

![Алгоритм 4 (быстрый столбик)](image/alg4.PNG){ #fig:004 width=80% }
Алгоритм 5 (деление многоразрядных целых чисел).

![Алгоритм 5 (деление многоразрядных целых чисел)](image/alg5.PNG){ #fig:005 width=80% }

# Выводы

В ходе выполнения данной лабораторной работы были реализованы алгоритмы для выполнения арифметических операций с большими целыми числами

