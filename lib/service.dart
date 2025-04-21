import 'dart:convert';

import 'package:flutter_project_for_n15/dio_client.dart';
import 'package:http/http.dart';

import 'model.dart';

class AppService {
  final DioClient dio;

  AppService({required this.dio});

  Future<List<PostModel>> getDatas(int page, int size) async {
    try {
      MainModel response = await dio.get("posts?_page=$page&_limit=$size");
      print("Response type: ${response}");
      return (response.data as List)
          .map((e) => PostModel.fromMap(e))
          .toList();
    } catch (e) {
      print("GetDatada Error: $e");
      throw Exception();
    }
  }
}
