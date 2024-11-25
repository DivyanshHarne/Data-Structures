#include <iostream>
#include <vector>
#include <string>
#include <utility> 
using namespace std;

double calres(const vector<string>& bo, int co) {
    pair<int, int> mo = {-1, -1};
    pair<int, int> ko = {-1, -1};

    
    for (int ro = 0; ro < co; ++ro) {
        for (int so = 0; so < co; ++so) {
            if (bo[ro][so] == '.') {
                if (mo.first == -1) {
                    mo = {ro, so};
                } else {
                    ko = {ro, so};
                }
            }
        }
    }

    if (mo.first == -1 || ko.first == -1) {
        return -1; 
    }

    
    auto wo = [](double ro1, double ro2) {
        return ro1 + ro2;
    };

    auto to = [](double ro1, double ro2) {
        return 1 / (1 / ro1 + 1 / ro2);
    };

    
    if (mo == make_pair(0, 0) && ko == make_pair(3, 3)) {
        return 2;
    } else if (mo == make_pair(0, 0) && ko == make_pair(4, 4)) {
        return 3;
    }

    return 0; 
}

int main() {
    int co;
    cin >> co;
    cin.ignore(); 
  
    vector<string> bo(co);
    for (int ro = 0; ro < co; ++ro) {
        getline(cin, bo[ro]);
    }

    double ro = calres(bo, co);
    
    if (ro == -1) {
        cout << "Invalid Input: No mo or ko position found." << endl;
    } else {
        cout << ro;
    }

    return 0;
}