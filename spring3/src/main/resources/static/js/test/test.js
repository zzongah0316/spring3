/**
 * 
 */
 document.addEventListener('DOMContentLoaded', ()=> {
	 
	 const formSelect = document.querySelector('#form-select');
	 const action = document.querySelector('#action');
	 const selectedOptionsSet = new Set();

            formSelect.addEventListener('change', (e) => {
                console.log('opt');
                const selectedOption = e.target.value;
                const optionText = `못난이 파프리카/${selectedOption}`;
                
                if (!selectedOptionsSet.has(optionText)) {
                    selectedOptionsSet.add(optionText);
                    const div = document.createElement("div");
                    div.innerHTML = `<p>${optionText}</p>`;
                    action.appendChild(div);
                }
	 });
 });