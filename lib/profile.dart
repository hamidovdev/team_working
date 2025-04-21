import 'package:flutter/material.dart';
import 'package:flutter_project_for_n15/themes.dart';

class ProfilePage extends StatefulWidget {
  final AppThemeClass theme;
  final VoidCallback refr;

  const ProfilePage({
    super.key,
    required this.theme,
    required this.refr,
  });

  @override
  State<ProfilePage> createState() => _ProfilePageState();
}

class _ProfilePageState extends State<ProfilePage> {
  @override
  Widget build(BuildContext context) {
    AppThemeClass appTheme = AppThemeClass();

print("AppThemni holati ${appTheme == widget.theme}");
    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        title: Text("Profile"),
      ),
      body: Center(
        child: ElevatedButton(
            onPressed: () {
              widget.theme.changeMode();
              // widget.refr();
              setState(() {});
            },
            child: Icon(Icons.add)),
      ),
    );
  }
}
