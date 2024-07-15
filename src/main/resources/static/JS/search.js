    document.addEventListener('DOMContentLoaded', function() {
        const searchInput = document.querySelector('.search');
        const searchContainer = searchInput.parentNode;

        // Create the icon element
        const searchIcon = document.createElement('span');
        searchIcon.classList.add('search-icon');
        searchIcon.innerHTML = `
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
            <path d="M13.6 14.4L17.1578 17.9579" stroke="#ABABAB" stroke-width="2" stroke-linecap="round"/>
            <path d="M8.9835 2.36438C12.6327 2.36438 15.591 5.32263 15.591 8.97178C15.591 12.621 12.6327 15.5793 8.9835 15.5793C5.33435 15.5793 2.3761 12.621 2.3761 8.97178C2.3761 5.32263 5.33435 2.36438 8.9835 2.36438Z" stroke="#ABABAB" stroke-width="2"/>
            </svg>
        `;

        // Insert the icon into the container
        searchContainer.insertBefore(searchIcon, searchInput);
    });