import 'package:flutter/material.dart';
import 'package:let_me_find_myself/pages/calendar/calendar.dart';
import 'package:let_me_find_myself/pages/home/home.dart';
import 'package:let_me_find_myself/pages/mission_list/mission_list.dart';
import 'package:let_me_find_myself/pages/my_page/my_page.dart';
import 'package:let_me_find_myself/pages/report/report.dart';
import 'package:let_me_find_myself/widgets/bottom_navbar.dart';

class MainScaffold extends StatefulWidget {
  const MainScaffold({super.key});

  @override
  State<MainScaffold> createState() => _MainScaffoldState();
}

class _MainScaffoldState extends State<MainScaffold> {

  int _currentIndex = 0 ; // 현재 사용자가 있는 페이지

  void _onTap(int index) {
    setState(() {
      _currentIndex = index;
    });
  }

  final List<Widget> _pages = [
    const HomePage(),
    const MissionListPage(),
    const ReportPage(),
    const CalendarPage(),
    const MyPage(),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body : _pages[_currentIndex],
      bottomNavigationBar: BottomNavbar(currentIndex: _currentIndex, onTab: _onTap),
    );
  }
}

