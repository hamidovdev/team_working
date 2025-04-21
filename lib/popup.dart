import 'package:flutter/material.dart';

class PopUpWidget extends StatelessWidget {
  final Function onClick;

  const PopUpWidget({
    super.key,
    required this.onClick,
  });

  @override
  Widget build(BuildContext context) {
    return Center(
      child: IconButton(
        onPressed: () {
          onClick(3);
        },
        icon: Text("PopUp"),
      ),
    );
  }
}
