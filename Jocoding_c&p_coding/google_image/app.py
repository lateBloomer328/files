from selenium import webdriver
import time
driver = webdriver.Chrome('chromedriver')
driver.get('https://www.google.com/search?q=고양이&tbm=isch&tbs=il:ol&hl=ko&sa=X&ved=0CAAQ1vwEahcKEwjozOKkrbiAAxUAAAAAHQAAAAAQAg&biw=1903&bih=898')
time.sleep(10)
driver.quit()