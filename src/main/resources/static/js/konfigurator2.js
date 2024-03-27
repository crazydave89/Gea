var menuWygrodzeniaIbramki = document.querySelector('.menuWygrodzeniaIbramki');

function addHiddenClassToAllMenu() {
            var elements = document.querySelectorAll('div.menumenu');
                elements.forEach(function(element) {
                element.classList.add('hidden');
                element.style.height = '0';
            });
        }
function addHiddenClassToAllForms() {
            var elements = document.querySelectorAll('form.myform');
                elements.forEach(function(element) {
                element.classList.add('hidden');
            });
        }


document.getElementById('option3').addEventListener('click', function() {
    addHiddenClassToAllMenu();
    menuWygrodzeniaIbramki.classList.remove('hidden');

  if (menuWygrodzeniaIbramki.clientHeight === 0) {
    menuWygrodzeniaIbramki.style.height = '50px'; // Rozciągnięcie diva do 50px
  } else {
    menuWygrodzeniaIbramki.style.height = '0'; // Zmniejszenie wysokości diva do 0
  }
});

document.getElementById('bramki3rurowe').addEventListener('click', function() {
  addHiddenClassToAllForms();
  bramki3ruroweForm.classList.remove('hidden');
});
document.getElementById('bramki2rurowe').addEventListener('click', function() {
  addHiddenClassToAllForms();
  bramki2ruroweForm.classList.remove('hidden');
});
document.getElementById('bramkiOneWay').addEventListener('click', function() {
  addHiddenClassToAllForms();
  bramkiOneWayForm.classList.remove('hidden');
});
document.getElementById('wygrodzeniaRuroweStale').addEventListener('click', function() {
  addHiddenClassToAllForms();
  wygrodzeniaRuroweStaleForm.classList.remove('hidden');
});

