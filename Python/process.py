from multiprocessing import Process, cpu_count
import time
def counter(num):
    count = 0
    while count < num:
        count += 1
def main():
    print(cpu_count())
    a = Process(target=counter,args=(1000000000,))
    a.start()
    a.join()
    print("Finished in:",time.perf_counter(),"seconds")
if __name__ == '__main__':
    main()

'Alternate for above code'
'''import time
num = 0
while num < 1000000000:
    num+=1
    if num==1000000000:
        print("Process is finished")
print("Finished in:",time.perf_counter(),"seconds")'''