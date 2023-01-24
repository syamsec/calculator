
#include <iostream>
using namespace std;

int main()
{
    float a,b,c=0;
    char sign;
    
    cout<<"Enter First Digit : ";
    cin>>a;
    
    cout<<"Enter Second Digit : ";
    cin>>b;
    
    
    cout<<"\n\nEnter Desired Operator\n [ + , - , * , / ] : ";
    
    cin>>sign;
    
    if(sign=='+')
    {c=a+b;}
    
    else if (sign=='-')
    {c=a-b;}
    
    else if (sign=='*')
    {c=a*b;}
    
    else if (sign=='/')
    {c=a/b;}
    
        
    else
    {cout<<"\nERROR !!!\n";}
    
    cout<<"\n"<<a<<sign<<b<<"="<<c<<"\n";
    
    cout<<"\nResult : "<<c<<"\n";
    
    
    return 0;
    
}






