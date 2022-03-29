from itertools import starmap
from tracemalloc import start


class Route:
    id      = int
    start   = []
    end     = []