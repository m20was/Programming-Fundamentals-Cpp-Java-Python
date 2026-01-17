#include <bits/stdc++.h>
using namespace std;

void printname(string M){
        M[5]='a';
	    cout <<M<<endl;
}

void doSomething(int ar[], int a){
    ar[0]=+100;
    cout<<ar[0]<<endl<<a;
}
	
	
int main() {
	/*
	int x,y;
	string a;
	char b;
	cin >> x>> y>> b;
	getline(cin,a);
	cout << "Hey Manish!" <<"\n"<<x<<"\n"<<y<<"\n"<<b<<"\n"<<a<<endl;
	// check chatgpt for input buffer issue
	
	int marks;
	cin >> marks;
	if(marks < 25){
	    cout<< "F";
	}
	else if( marks <= 44 ){
	    cout<< "E";
	}
	else if( marks <= 49 ){
	    cout<< "D";
	}
	else if( marks <= 59 ){
	    cout<< "C";
	}
	else if( marks <= 79 ){
	    cout<< "B";
	}
	else if( marks <= 100 ){
	    cout<< "A";
	}
	
    // Switch
    
	int day;
	cin>> day;
	
	switch(day){
	    case 1:
	        cout << "Monday";
	        break;
	    case 2:
	        cout << "Tday";
	        break;
	    case 3:
	        cout << "Wday";
	        break;
	    case 4:
	        cout << "Tday";
	        break;
	    case 5:
	        cout << "Fday";
	        break;
	    case 6:
	        cout << "Stday";
	        break;
	    case 7:
	        cout << "Snday";
	        break;
	    default:
	        cout << "Invalid";
	}
	

	// ARRAYS
	int x,y;
	cin>> x >> y;
	int ar[x][y];
	
	for(int i = 0; i < x ; i++){
	    for(int j = 0; j < y; j++){
	        cin>> ar[i][j];
	    }
	}
	for(int i =0; i < x ; i++){
	    for(int j =0; j < y; j++){
	        cout<< ar[i][j]<<" ";
	    }
	    cout<<"\n";
	}
	
		
	
	string m = "Manish";
	int len = m.size();
	m[len-1] = 'a';
	cout << m;
	

	// Loops
	
	for (int i = 0; i < 11; i = i + 2){
	    cout<< "Manish " << i << endl;
	}
	
	int i = 0;
	do {
	    
	    cout<< "Biswas " << i << endl;
	    i = i + 2;
	}while(i<11);
	*/
	
	// Functions
	//    types - void, return, parameterised, non parameterised
	
	string M = "Manish";
	printname(M);//Pass by value
	cout <<M<<endl;
	
	int n;
	cin>>n;
	int ar[n];
	for(int i=0; i<n; i++){
	    cin>>ar[i];
	}
	doSomething(ar,n);
	return 0;

}
