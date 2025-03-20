import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: const Color.fromARGB(223, 255, 255, 255),
        appBar: myAppBar(),

        body: Center(
          child: Column(
            children: [
              Padding(padding: EdgeInsets.all(10)),
              Container(
                padding: EdgeInsets.all(20),
                height: 230,
                width: 400,

                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(30),
                ),
                child: Column(
                  children: [
                    Row(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        ClipOval(
                          child: Image.asset(
                            'assets/images/john.jpeg',
                            height: 120,
                            width: 120,
                            fit: BoxFit.cover,
                          ),
                        ),
                        SizedBox(width: 10),
                        Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(
                              "John Lennon",
                              style: TextStyle(
                                fontSize: 18,
                                fontWeight: FontWeight.bold,
                                color: Colors.blueAccent,
                              ),
                            ),
                            Text(
                              "Musician",
                              style: TextStyle(
                                fontSize: 24,
                                color: const Color.fromARGB(255, 0, 0, 0),
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            SizedBox(height: 15),
                            Row(
                              children: [
                                SizedBox(width: 5),
                                Image.asset(
                                  'assets/images/ig.jpeg',
                                  height: 25,
                                ),
                                SizedBox(width: 5),
                                Image.asset('assets/images/x.png', height: 25),
                                SizedBox(width: 5),
                                Image.asset(
                                  'assets/images/web.png',
                                  height: 25,
                                ),
                              ],
                            ),
                          ],
                        ),
                        Spacer(),
                        Row(
                          children: [
                            Icon(Icons.location_on, color: Colors.grey),
                            SizedBox(width: 5),
                            Text(
                              "Canada",
                              style: TextStyle(
                                fontSize: 14,
                                color: Colors.grey,
                              ),
                            ),
                          ],
                        ),
                      ],
                    ),
                    SizedBox(height: 10),
                    Container(
                      height: 1,
                      width: double.infinity,
                      color: Colors.black,
                    ),
                    SizedBox(height: 5),
                    Row(children: [Text("Interests")]),
                    SizedBox(height: 5),
                    Row(
                      children: [
                        Container(
                          height: 25,
                          width: 90,
                          decoration: BoxDecoration(
                            color: const Color.fromARGB(72, 82, 92, 93),
                            borderRadius: BorderRadius.circular(20),
                          ),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [
                              Text(
                                "Running 🏃🏼",
                                style: TextStyle(fontWeight: FontWeight.bold),
                              ),
                            ],
                          ),
                        ),
                        SizedBox(width: 7),
                        Container(
                          height: 25,
                          width: 90,
                          decoration: BoxDecoration(
                            color: const Color.fromARGB(49, 82, 92, 93),
                            borderRadius: BorderRadius.circular(20),
                          ),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [Text("Coding 💻")],
                          ),
                        ),
                        SizedBox(width: 7),
                        Container(
                          height: 25,
                          width: 90,
                          decoration: BoxDecoration(
                            color: const Color.fromARGB(53, 82, 92, 93),
                            borderRadius: BorderRadius.circular(20),
                          ),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [Text("Sleeping 💤")],
                          ),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
              SizedBox(height: 25),
              Container(
                padding: EdgeInsets.all(10),
                height: 110,
                width: 400,

                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(20),
                ),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    const Text(
                      "Resume",
                      style: TextStyle(
                        fontSize: 18,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    SizedBox(height: 5),
                    Container(height: 1, color: Colors.black),
                    const SizedBox(height: 5),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Row(
                          children: [
                            const Icon(
                              Icons.insert_drive_file,
                              color: Colors.black54,
                            ),
                            const SizedBox(width: 10),
                            const Text(
                              "John Doe CV",
                              style: TextStyle(
                                fontSize: 16,
                                color: Colors.black87,
                              ),
                            ),
                          ],
                        ),
                        IconButton(
                          icon: const Icon(
                            Icons.download_rounded,
                            color: Colors.blue,
                          ),
                          onPressed: () {},
                        ),
                      ],
                    ),
                  ],
                ),
              ),
              SizedBox(height: 20),
              Container(
                padding: EdgeInsets.all(20),
                height: 430,
                width: 400,
                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(20),
                ),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Experience",
                      style: TextStyle(
                        fontSize: 25,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    SizedBox(height: 5),
                    Container(height: 1, color: Colors.black),
                    SizedBox(height: 10),
                    Row(
                      children: [
                        Image.asset('assets/images/unknown.jpeg', height: 40),

                        Row(
                          children: [
                            SizedBox(width: 10),
                            Text(
                              "Business name",
                              style: TextStyle(
                                fontSize: 20,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            SizedBox(width: 70),
                            Container(
                              height: 30,
                              width: 90,
                              decoration: BoxDecoration(
                                color: const Color.fromARGB(20, 0, 0, 0),
                                borderRadius: BorderRadius.circular(30),
                              ),
                              child: Center(child: Text("2025 - 2027"),),
                            ),
                          ],
                        ),
                      ],
                    ),
                    SizedBox(height: 20),
                    Text(
                      "           🎹  Singer ",
                      style: TextStyle(
                        fontSize: 20,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Text(
                      "                ✅ Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Row(
                      children: [
                        Image.asset('assets/images/unknown.jpeg', height: 40),

                        Row(
                          children: [
                            SizedBox(width: 10),
                            Text(
                              "Business name",
                              style: TextStyle(
                                fontSize: 20,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                            SizedBox(width: 70),
                            Container(
                              height: 30,
                              width: 90,
                              decoration: BoxDecoration(
                                color: const Color.fromARGB(20, 0, 0, 0),
                                borderRadius: BorderRadius.circular(30),
                              ),
                              child: Center(child: Text("2027 - 2029")),
                            ),
                          ],
                        ),
                      ],
                    ),
                    SizedBox(height: 20),
                    Text(
                      "           💻  Engineer ",
                      style: TextStyle(
                        fontSize: 20,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Text(
                      "                ✅ Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),
                    Text(
                      "                Lorem ipsum ;l  ds  dsd fdd dd d d d",
                    ),



                  ],

                ),
              ),

            ],
          ),
        ),
      ),
    );
  }
}



PreferredSizeWidget myAppBar() {
  return AppBar(
    leading: IconButton(
      onPressed: () {},
      icon: Icon(Icons.arrow_back, size: 30, color: Colors.white),
    ),
    actions: [
      IconButton(
        onPressed: () {},
        icon: Icon(Icons.menu, size: 30, color: Colors.white),
      ),
    ],
    backgroundColor: Colors.blueAccent,
  );
}
