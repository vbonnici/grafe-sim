// -*- mode:c++; coding:utf-8; indent-tabs-mode:nil; -*-
// ALDS1_2-D

#include <algorithm>
#include <iostream>

static void print_ints(const int as[], const unsigned int n,
                       const char* sep = " ") {
  const char* out_sep = "";
  for (unsigned int i = 0; i < n; ++i) {
    std::cout << out_sep << as[i];
    out_sep = sep;
  }
  std::cout << std::endl;
}

static void print_int(const unsigned int n) {
  std::cout << n << std::endl;
}

static unsigned int cnt = 0;

inline
static void insert(int as[], const unsigned int i, const unsigned int d) {
  const int asi = as[i];
  unsigned int j = i;
  while (j >= d && asi < as[j-d]) {
    as[j] = as[j-d];
    j -= d;
    ++cnt;
  }
  as[j] = asi;
}

void insertion_sort(int as[], const unsigned int n, const unsigned int d) {
  for (unsigned int i = d; i < n; ++i) {
    insert(as, i, d);
  }
}

inline
unsigned int next_g(const unsigned int g) { return 3*g + 1; }

unsigned int gen_m(const unsigned int n) {
  if (n < 2) {
    return 1;
  }
  unsigned int m = 1;
  for (unsigned int g = 1; g < n; g = next_g(g)) {
    ++m;
  }
  return m-1; // over 1 time
}

void shell_sort(int as[], const unsigned int n) {
  cnt = 0;

  unsigned int m = gen_m(n);
  int gs[m];
  for (unsigned int g = 1, i = 0; i < m; ++i) {
    gs[m-1-i] = g;
    g = next_g(g);
  }
  print_int(m);
  print_ints(gs, m);

  for(unsigned int i = 0; i < m; ++i) {
    insertion_sort(as, n, gs[i]);
  }
  
  print_int(cnt);
}

int main(void) {
  unsigned int n;
  std::cin >> n;
  int as[n];
  for (unsigned int i = 0; i < n; ++i) {
    std::cin >> as[i];
  }

  shell_sort(as, n);
  print_ints(as, n, "\n");

  return 0;
}
// end