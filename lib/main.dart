import 'package:flutter/material.dart';
import 'package:flutter_project_for_n15/dio_client.dart';
import 'package:flutter_project_for_n15/service.dart';

import 'model.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatefulWidget {
  const MainApp({super.key});

  @override
  State<MainApp> createState() => _MainAppState();
}

class _MainAppState extends State<MainApp> {
  int page = 1;
  int size = 20;
  List<PostModel> datas = [];
  bool hasMore = true;

  @override
  void initState() {
    AppService(dio: DioClient()).getDatas(page, size).then((value) {
      datas = value;
      page++;
      setState(() {});
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body:
        datas.isEmpty
            ? Center(child: CircularProgressIndicator())
            : ListView.builder(
          itemCount: datas.length + 1,
          itemBuilder: (context, index) {

            if (index < datas.length) {
              return ListTile(
                subtitle: Text("${index + 1} - ${datas[index].title}"),
              );
            }
            if (!hasMore) {
              return Center(
                child: Text(
                  "Boshqa ma'lumot yo'q",
                  style: TextStyle(
                    fontWeight: FontWeight.w800,
                    fontSize: 28,
                  ),
                ),
              );
            }
            if (index == datas.length && hasMore) {
              AppService(dio: DioClient()).getDatas(page, size).then((value) {
                List<PostModel> newList = List.from(datas);
                newList.addAll(value);
                if (value.length < size) {
                  hasMore = false;
                } else {
                  page++;
                }
                datas = newList;
                setState(() {});
              });
              return Center(child: CircularProgressIndicator());
            }
          },
        ),
      ),
    );
  }
}
