import 'dart:ui';

import 'package:flutter/material.dart';

class AppThemeClass {
  static final _instanse = AppThemeClass._privateConstructor();

  factory AppThemeClass() {

    return _instanse;
  }

  AppThemeClass._privateConstructor();

  bool _lightMode = true;

  List<Color> _colors = [
    Colors.red,
    Colors.yellow,
    Colors.blue,
    Colors.green,
    Colors.black,
    Colors.white
  ];
  AppThemeColors _textColor = AppThemeColors.black;
  int _textSize = 18;

   ThemeData appTheme = ThemeData();


  get getAppTheme => appTheme;

  get lightMode => _lightMode;

  get textColor => _textColor;

  get textSize => _textSize;

  void changeMode() {
    print("111AppThemni holati Singleton ichidagi ${_lightMode}");
    _lightMode = !_lightMode;
    print("222AppThemni holati Singleton ichidagi ${_lightMode}");
    print("--------------------------------------");
  }

  void changeTextColor(AppThemeColors color) {
    _textColor = color;
  }

  void changeAppTextSize(int size) {
    _textSize = size;
  }
}

enum AppThemeColors { red, yellow, blue, green, black, white }
