CXX := g++
CXXFLAGS := -std=c++17 -Wall -Wextra -Iinclude

all: test

test: build/test_mpd
./build/test_mpd

build/test_mpd: src/mpd_firmware.cpp tests/test_mpd_firmware.cpp | build
$(CXX) $(CXXFLAGS) $^ -o $@

build:
mkdir -p build

clean:
rm -rf build

.PHONY: all test clean
