#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'cutTheSticks' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def cutTheSticks(arr):
    # Write your code here

    out = []
    arr.sort()

    while len(arr) > 0:
        out.append(len(arr))
        lowestStick = arr.pop(0)

        while len(arr) > 0 and arr[0] <= lowestStick:
            arr.pop(0)

    return out
