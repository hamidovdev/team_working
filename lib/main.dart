import 'package:flutter/material.dart';

void main() {
  runApp(MainApp());
}

class MainApp extends StatefulWidget {
  MainApp({super.key});

  @override
  State<MainApp> createState() => _MainAppState();
}

class _MainAppState extends State<MainApp> {
  int? ind;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            for (int i = 0; i < 5; i++)
              GestureDetector(
                onTap: () {
                  if(ind == i){
                    ind = null;
                  }
                  else{
                    ind = i;
                  }
                  setState(() {});
                },
                child: Container(
                  width: 20,
                  height: 20,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(
                      100,
                    ),
                    color:  ind != null && i <= ind! ? Colors.yellow : Colors.blue,
                  ),
                  margin: EdgeInsets.symmetric(
                    horizontal: 5,
                  ),
                ),
              )
          ],
        ),
      ),
    );
  }
}
