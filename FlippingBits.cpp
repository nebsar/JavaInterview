#include <bits/stdc++.h>
#include <string>

using namespace std;

// Complete the flippingBits function below.
long flippingBits(long n) {

    string str = bitset<32>(n).to_string();

    //cout << str << endl;

 
    for(int i = 0; i < str.length(); i++){
        
        if (str[i]=='0')
            str[i] = '1';
        else
            str[i] = '0';
    }

    //cout << str << endl;

    unsigned long rtrn = std::bitset<32>(str).to_ulong();

    return rtrn;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int q;
    cin >> q;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int q_itr = 0; q_itr < q; q_itr++) {
        long n;
        cin >> n;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        long result = flippingBits(n);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
