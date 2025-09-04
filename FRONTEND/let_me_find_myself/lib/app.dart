import 'package:flutter/material.dart';
import 'package:let_me_find_myself/pages/auth/login.dart';
import 'package:let_me_find_myself/utils/color.dart';
import 'package:let_me_find_myself/widgets/main_scaffold.dart';

class LetMeFindMyself extends StatelessWidget {
  const LetMeFindMyself({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(
        fontFamily: 'SOYO_Maple',
        scaffoldBackgroundColor: AppColors.bgColor,
        bottomNavigationBarTheme: BottomNavigationBarThemeData(
          backgroundColor: Colors.white,
        ),
      ),
      home: const AuthGate(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class AuthGate extends StatelessWidget {
  const AuthGate({super.key});

  @override
  Widget build(BuildContext context) {
    // 추후에 로그인 확인 로직 추가. 일단 로그인 되어 있다고 가정.
    final bool isLoggedIn = true;

    if (!isLoggedIn) {
      return const LoginPage();
    } else {
      return const MainScaffold();
    }
  }
}

