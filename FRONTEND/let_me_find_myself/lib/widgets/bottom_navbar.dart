import 'package:flutter/material.dart';
import 'package:let_me_find_myself/assets/icons/icons.dart';

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
        BottomNavigationBarItem(
          icon: AppIcons.home(
            color:  currentIndex == 0 ? Colors.blue : Colors.green,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.missionList(
            color:  currentIndex == 1 ? Colors.blue : Colors.green,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.report(
            color:  currentIndex == 2 ? Colors.blue : Colors.green,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.calendar(
            color:  currentIndex == 3 ? Colors.blue : Colors.green,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.myPage(
            color:  currentIndex == 4 ? Colors.blue : Colors.green,
          ),
          label: '',
        ),

      ],
    );
  }
}
