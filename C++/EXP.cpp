#include <iostream>
using namespace std;
class Palindrome {

 public:
  void isPalindrome(int n) {
    int number = n;
    int reverse = 0;
    while ( number != 0 ){
        reverse = reverse * 10+ number %10;
        number = number / 10;
    }
    if(n==reverse){
        cout << n << " is a palindrome" << endl;
    }else{
        cout << n << " is not a palindrome" << endl;
    }


  }
};
int main() {
  Palindrome P;
  int n;
  cout << "Enter number to check if palindrome or not" << endl;
  cin >> n;
  P.isPalindrome(n);

return 0;
}