import 'package:dio/dio.dart';

class DioClient {
  late final Dio _dio;

  DioClient() {
    _dio = Dio(BaseOptions(
      baseUrl: "https://jsonplaceholder.typicode.com/",
      connectTimeout: const Duration(seconds: 30),
      receiveTimeout: const Duration(seconds: 30),
      headers: {
        'Content-Type': 'application/json; charset=UTF-8',
      },
    ));
  }

  Dio get dio => _dio;

  Future<MainModel> get(
    String url, {
    Map<String, dynamic>? header,
    Map<String, dynamic>? queryParameters,
    bool withoutHeader = false,
  }) async {
    try {
      Response response = await _dio.get(
        url,
        queryParameters: queryParameters,
        options: Options(
          headers: withoutHeader ? null : header,
        ),
      );
      print("GetDan kelgan malumotlar: ${response.headers}");
      if ((response.statusCode ?? 404) <= 201) {
        return MainModel(
          data: response.data ?? "No Data",
          statusCode: response.statusCode ?? 403,
          message: response.statusMessage ?? "Error!",
        );
      }else{
        return MainModel(data: "Has no data", statusCode: 403, message: "Error");
      }
    } catch (e) {
      print("Getda Error:");
      return throw Exception();
    }
  }
}

class MainModel {
  final dynamic data;
  final int statusCode;
  final String message;

  MainModel(
      {required this.data, required this.statusCode, required this.message});
}
