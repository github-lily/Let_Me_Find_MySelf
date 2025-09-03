import 'package:flutter/material.dart';
import 'package:let_me_find_myself/pages/home/home.dart';

class LetMeFindMyself extends StatelessWidget {
  const LetMeFindMyself({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //추후에 HomePage -> Login 페이지로 바꿀것!
      home: HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}
