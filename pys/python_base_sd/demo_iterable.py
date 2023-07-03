my_iterable = range(1,3)
my_iterable = my_iterable.__iter__()
print(my_iterable.__next__())
print(my_iterable.__next__())
#print(my_iterable.__next__())
f = [x for x in 'ABC']
print(f)
