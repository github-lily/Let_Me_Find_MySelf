import 'package:flutter_svg/flutter_svg.dart';
import 'package:flutter/material.dart';

class AppIcons {
  // 하단 바 사이즈 고정
  static const double _navbarSize = 24.0;

  // 네브바 요소들
  static SvgPicture home({Color? color, double size = _navbarSize}) =>
      SvgPicture.asset(
        'lib/assets/icons/home.svg',
        width: size,
        height: size,
        color: color,
      );
  static SvgPicture missionList({Color? color, double size = _navbarSize}) =>
      SvgPicture.asset(
        'lib/assets/icons/mission_list.svg',
        width: size,
        height: size,
        color: color,
      );
  static SvgPicture report({Color? color, double size = _navbarSize}) =>
      SvgPicture.asset(
        'lib/assets/icons/report.svg',
        width: size,
        height: size,
        color: color,
      );
  static SvgPicture calendar({Color? color, double size = _navbarSize}) =>
      SvgPicture.asset(
        'lib/assets/icons/calendar.svg',
        width: size,
        height: size,
        color: color,
      );
  static SvgPicture user({Color? color, double size = _navbarSize}) =>
      SvgPicture.asset(
        'lib/assets/icons/user.svg',
        width: size,
        height: size,
        color: color,
      );
}
