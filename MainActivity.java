package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView inp, out;
    String input = "", output = "";
    double result = 0 , num = 0;
    char op;
    int i,j;
    String testinp="",testinp2="";
    int m=0;
    String peas;
    String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inp = findViewById(R.id.input);
        out = findViewById(R.id.output);
    }

    public void seven(View view) {

        input = input + "7";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }
        else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }


    }

    public void four(View view) {

        input = input + "4";
        inp.setText(input);

        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }
        else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }


    }

    public void one(View view) {

        input = input + "1";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void zero(View view) {

        input = input + "0";
        inp.setText(input);

        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void dot(View view) {

        input = input + ".";
        inp.setText(input);

        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void three(View view) {

        input = input + "3";
        inp.setText(input);

        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void two(View view) {

        input = input + "2";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void five(View view) {

        input = input + "5";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void six(View view) {

        input = input + "6";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void eight(View view) {
        input = input + "8";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void nine(View view) {
        input = input + "9";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void clr(View view) {

        if(input.length()>0) {

            input = input.substring(0, input.length() - 1);
            output = "";
            inp.setText(input);
            out.setText(output);
            if(input.length() >= 7){
                inp.setTextSize(25);
                //out.setTextSize(25);
            }else {
                inp.setTextSize(45);
                out.setTextSize(50);
            }
        }

        else
        {
            input = "";
            output = "";
            inp.setText(input);
            out.setText(output);
            res = "";
            result = 0;
        }

    }

    public void clear(View view) {

        input = "";
        output = "";
        inp.setText(input);
        out.setText(output);
        res = "";
        result = 0;

    }

    public void div(View view) {
        input = input + "/";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }


    }

    public void mul(View view) {

        input = input + "x";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void sub(View view) {

        input = input + "-";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }

    public void add(View view) {

        input = input + "+";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }

    }


    public void equals(View view) {

        String parenthised = "";
        String inte = "";
        for (int i=0 ; i<input.length() ; i++){

            char a = input.charAt(i);

            if (Character.isDigit(a)){
                inte = inte + a;
            }
            else if (a == '+'|| a == '-' || a == 'x' || a=='/'||a=='('||a==')'){
                parenthised = parenthised + inte + a;
                inte = "";

            }
            else if (a == '.'){
                String parttwo = "";
                String finalpart = "";
                for (int j = i + 1 ; j<input.length();j++){

                    if (Character.isDigit(input.charAt(j)))
                        parttwo = parttwo + input.charAt(j);

                    else {
                        break;
                    }
                }

                finalpart = "(" + inte + parttwo + "/" + fetchtens(parttwo.length()) + ")";
                inte = finalpart;
                i = i + parttwo.length();
            }

        }
        parenthised = parenthised + inte ;

        Stack<Double> numbers = new Stack<>();
        //Stack for operators
        Stack<Character> operations = new Stack<>();
        for(int i=0; i<parenthised.length();i++) {
            char c = parenthised.charAt(i);
            //check if it is number

            if(Character.isDigit(c)){
                //Entry is Digit, it could be greater than one digit number
                double num = (double) 0;
                while (Character.isDigit(c)) {
                    num = num*10 + (c-'0');
                    i++;
                    if(i < parenthised.length())
                        c = parenthised.charAt(i);
                    else
                        break;
                }
                i--;
                //push it into stack
                numbers.push(num);
            }else if(c=='('){
                //push it to operators stack
                operations.push(c);
            }
            //Closed brace, evaluate the entire brace
            else if(c==')') {
                while(operations.peek()!='('){
                    Double output = performOperation(numbers, operations);
                    //push it back to stack
                    numbers.push((double) output);
                }
                operations.pop();
            }
            // current character is operator
            else if(isOperator(c)){
                //1. If current operator has higher precedence than operator on top of the stack,
                //the current operator can be placed in stack
                // 2. else keep popping operator from stack and perform the operation in  numbers stack till
                //either stack is not empty or current operator has higher precedence than operator on top of the stack
                while(!operations.isEmpty() && precedence(c)<=precedence(operations.peek())){
                    Double output = performOperation(numbers, operations);
                    //push it back to stack
                    numbers.push((double) output);
                }
                //now push the current operator to stack
                operations.push(c);
            }
        }
        //If here means entire expression has been processed,
        //Perform the remaining operations in stack to the numbers stack

        while(!operations.isEmpty()){
            Double output = performOperation(numbers, operations);
            //push it back to stack
            numbers.push(output);
        }
        result =  numbers.pop();
        peas = Double.toString(result);
        if(iswhole(Double.toString(result))){

            peas = peas.substring(0,peas.length()-2);
            out.setText(peas);
            if(peas.length() >7)
                out.setTextSize(25);
        }
        else {
            if(peas.length() >7)
                out.setTextSize(25);

            out.setText(peas);
        }



    }
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case 'x':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public Double performOperation(Stack<Double> numbers, Stack<Character> operations) {
        Double a = numbers.pop();
        Double b = numbers.pop();
        char operation = operations.pop();
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case 'x':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0.0;
    }

    public boolean isOperator(char c){
        return (c=='+'||c=='-'||c=='/'||c=='x'||c=='^');
    }

    public boolean iswhole(String c){
        for(int i=0; i < c.length();i++ ) {
            if (c.charAt(i)!='.'){
                continue;
            }
            else {
                String m = c.substring(i+1);
                if(m.length()==1 && c.charAt(i+1) == '0'){
                    return true;
                }
            }
        }
        return false;
    }

    public void paropen(View view) {

        input = input + "(";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }
    }
    public void parclose(View view) {
        input = input + ")";
        inp.setText(input);
        if(input.length() >= 7){
            inp.setTextSize(25);
            //out.setTextSize(25);
        }else {
            inp.setTextSize(45);
            out.setTextSize(50);
        }
    }
    private static String fetchtens(int length) {
        long mnum = 1;
        for (int k = 1; k <= length ; k++){
            mnum = mnum * 10;
        }
        return Long.toString(mnum);
    }
}
