int main() {
string e1, e2; 
int r;
cin >> e1 >> e2 >> r;
int a1, b1, c1, d1, n1, a2, b2, c2, d2, n2;
scanf(e1.C_str(), "%dx+%dy+%dz+%dw<=%d", &a1, &b1, &c1, &d1, &n1);
scanf(e2.c_str(), "%dx+%dy+%dz+%dw<=%d", &a2, &b2, &c2, &d2, &n2);

vector<vector<int>> combinations;
for (int x = 0; x <= r; x++) {
    for (int y = 0; y + x <= r; y++) {
        for (int z = 0; z + x + y <= r; z++) {
            int w = r - x - y - z;
            combinations.push_back({x, y, z, w});
        }
    }
}
set<int> results;
for (auto &vars1: combinations) {
    int v1 = a1 * vars1[0] + b1 * vars1[1] + c1 * vars1[2] + d1 * vars1[3];
    if (v1 > n1) continue;

    for (auto &vars2: combinations) {
        int v2 = a2 * vars2[0] + b2 * vars2[1] + c2 * vars2[2] + d2 * vars2[3];
        if (v2 > n2) continue;
        if (v1 == v2) results.insert(v1);
    }
}
cout << results. size() << endl;
return 0;
}