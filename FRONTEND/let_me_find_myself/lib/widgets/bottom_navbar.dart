import 'package:flutter/material.dart';
import 'package:let_me_find_myself/assets/icons/icons.dart';
import 'package:let_me_find_myself/utils/color.dart';

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
            color:  currentIndex == 0 ? AppColors.grey60 : AppColors.grey30,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.missionList(
            color:  currentIndex == 1 ? AppColors.grey60 : AppColors.grey30,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.report(
            color:  currentIndex == 2 ? AppColors.grey60 : AppColors.grey30,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.calendar(
            color:  currentIndex == 3 ? AppColors.grey60 : AppColors.grey30,
          ),
          label: '',
        ),
        BottomNavigationBarItem(
          icon: AppIcons.myPage(
            color:  currentIndex == 4 ? AppColors.grey60 : AppColors.grey30,
          ),
          label: '',
        ),

      ],
    );
  }
}
