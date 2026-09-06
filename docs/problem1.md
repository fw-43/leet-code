# Problem 1 &mdash; Two Sum

The key is to utilize a fast-lookup HashMap to store the pair of value and index we encounter in one-pass.

Since we can safely assume that each input would have exactly one solution, so for a given target at each nums[i], we can fast-lookup the map for the remainder of target and nums[i], if it exists in the map, we can then return: the index of the remainder in the map AND the current index.

[Go Back](../README.md)

