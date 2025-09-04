import 'package:flutter/material.dart';

class BottomNavbar extends StatelessWidget {

  final int currentIndex;
  final ValueChanged<int> onTab;

  const BottomNavbar({
    super.key,
    required this.currentIndex,
    required this.onTab,
  });

  @override
  Widget build(BuildContext context) {
    return BottomNavigationBar(
      currentIndex: currentIndex,
        onTap: onTab,
      type: BottomNavigationBarType.fixed,
      backgroundColor: Colors.white,
      items: [
        BottomNavigationBarItem(icon: Icon(Icons.access_alarm), label: ''),
        BottomNavigationBarItem(icon: Icon(Icons.access_alarm), label: ''),
        BottomNavigationBarItem(icon: Icon(Icons.access_alarm), label: ''),
        BottomNavigationBarItem(icon: Icon(Icons.access_alarm), label: ''),
        BottomNavigationBarItem(icon: Icon(Icons.access_alarm), label: ''),
  ]);
  }
}
