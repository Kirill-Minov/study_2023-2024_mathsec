---
## Front matter
lang: ru-RU
title: Лабораторная работа №6
subtitle: Математические основы защиты информации и информационной безопасности
author:
  - Минов К.В., НПМмд-02-23
institute:
  - Российский университет дружбы народов
  - Москва, Россия
date: 25 ноября 2023

## i18n babel
babel-lang: russian
babel-otherlangs: english

## Formatting pdf
toc: false
toc-title: Содержание
slide_level: 2
aspectratio: 169
section-titles: true
theme: metropolis
header-includes:
 - \metroset{progressbar=frametitle,sectionpage=progressbar,numbering=fraction}
 - '\makeatletter'
 - '\beamer@ignorenonframefalse'
 - '\makeatother'
---

## Цель лабораторной работы

Реализовать на языке программирования p-метод Полларда

## Теоретическое введение

Задача разложения составного числа на множители формулируется
следующим образом: для данного положительного целого числа n найти его
каноническое разложение n = p1^a1,p2^a2 …рs^as, где pi - попарно различные простые
числа, ai >= 1.


## Ход выполнения лабораторной работы

![Рис.1: p-метод Полларда](images/p-методПолларда.PNG){ #fig:001 width=45% }


## Вывод
В ходе выполнения данной лабораторной работы был реализован p-метод Полларда
