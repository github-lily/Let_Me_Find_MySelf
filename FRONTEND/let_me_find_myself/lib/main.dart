import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Let Me Find Myself',
      home: Scaffold(
        appBar: AppBar(title: Text("레미파 프로젝트")),
        body: Center(child: Text("레미파 홈"),),
      ),
      debugShowCheckedModeBanner: false,
    );
  }
}
