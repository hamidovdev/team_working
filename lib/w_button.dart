import 'package:flutter/material.dart';

class WButton extends StatefulWidget {
  double? width;
  double? height;
  Function onTap;
  Color color;
  double borderRadius;
  String text;
  bool isLoading;
  bool isDisabled;
  TextStyle style;

  WButton({
    super.key,
    this.width,
    this.height,
    this.color = Colors.blue,
    this.text = "",
    required this.onTap,
    this.borderRadius = 25,
    this.style = const TextStyle(
      fontSize: 16,
      fontWeight: FontWeight.w600,
      color: Colors.blue,
    ),
    this.isDisabled = false,
    this.isLoading = false,
  });

  @override
  State<WButton> createState() => _WButtonState();
}

class _WButtonState extends State<WButton> {
  Color bgColor = Colors.green;

  @override
  Widget build(BuildContext context) {

    return GestureDetector(
      onTap: () {
        if(widget.color == Colors.green){
          widget.color = bgColor;
        }else{
          bgColor = widget.color;
          widget.color = Colors.green;
        }
        setState(() {

        });
        if (!widget.isDisabled && !widget.isLoading) {
          widget.onTap();
        }
      },
      child: SizedBox(
        width: widget.width,
        height: widget.height,
        child: DecoratedBox(
          decoration: BoxDecoration(
            color: widget.color,
            borderRadius: BorderRadius.circular(widget.borderRadius),
          ),
          child: Center(
            child: widget.isLoading
                ? CircularProgressIndicator()
                : Text(
                    widget.text,
                    style: widget.style,
                  ),
          ),
        ),
      ),
    );
  }
}
